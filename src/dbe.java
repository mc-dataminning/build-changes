import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbe extends cwp implements cww {
   private static final Codec<eeo> f = kd.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eeo $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dbe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dbe::new));
   public static final dkg b = djw.aP;
   protected final eeo c;
   private final List<eeq> g;
   public static final eml d = cwp.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ic> e = ImmutableList.of(ic.a, ic.d, ic.c, ic.f, ic.e);

   @Override
   public MapCodec<dbe> a() {
      return a;
   }

   protected dbe(eeo $$0, djf.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : emi.a();
   }

   @Override
   public boolean e_(djg $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean a_(djg $$0, csu $$1, hx $$2) {
      return false;
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return !this.c.a(asl.b);
   }

   @Override
   public eeq c_(djg $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(djg $$0, djg $$1, ic $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.a;
   }

   @Override
   public List<cmx> a(djg $$0, ehb.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return emi.a();
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((ctr)$$1));
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((ctr)$$1));
      }
   }

   private boolean a(cto $$0, hx $$1, djg $$2) {
      if (this.c.a(asl.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cwr.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ic $$4 = (ic)var5.next();
            hx $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(asl.a)) {
               cwp $$6 = $$0.b_($$1).b() ? cwr.co : cwr.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cwr.mW)) {
               $$0.b($$1, cwr.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(ctp $$0, hx $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public cmx a(@Nullable cfh $$0, ctp $$1, hx $$2, djg $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cwr.a.o(), 11);
         return new cmx(this.c.a());
      } else {
         return cmx.f;
      }
   }

   @Override
   public Optional<arq> au_() {
      return this.c.j();
   }
}
