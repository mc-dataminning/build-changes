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

public class dbf extends cwq implements cwx {
   private static final Codec<eep> f = kd.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eep $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dbf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dbf::new));
   public static final dkh b = djx.aP;
   protected final eep c;
   private final List<eer> g;
   public static final emm d = cwq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ic> e = ImmutableList.of(ic.a, ic.d, ic.c, ic.f, ic.e);

   @Override
   public MapCodec<dbf> a() {
      return a;
   }

   protected dbf(eep $$0, djg.d $$1) {
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
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : emj.a();
   }

   @Override
   public boolean e_(djh $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean a_(djh $$0, csv $$1, hx $$2) {
      return false;
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return !this.c.a(asm.b);
   }

   @Override
   public eer c_(djh $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(djh $$0, djh $$1, ic $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.a;
   }

   @Override
   public List<cmy> a(djh $$0, ehc.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return emj.a();
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cts)$$1));
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((cts)$$1));
      }
   }

   private boolean a(ctp $$0, hx $$1, djh $$2) {
      if (this.c.a(asm.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cws.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ic $$4 = (ic)var5.next();
            hx $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(asm.a)) {
               cwq $$6 = $$0.b_($$1).b() ? cws.co : cws.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cws.mW)) {
               $$0.b($$1, cws.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(ctq $$0, hx $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public cmy a(@Nullable cfi $$0, ctq $$1, hx $$2, djh $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cws.a.o(), 11);
         return new cmy(this.c.a());
      } else {
         return cmy.f;
      }
   }

   @Override
   public Optional<arr> au_() {
      return this.c.j();
   }
}
