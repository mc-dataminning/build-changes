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

public class day extends cwj implements cwq {
   private static final Codec<eei> f = kd.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eei $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<day> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, day::new));
   public static final dka b = djq.aP;
   protected final eei c;
   private final List<eek> g;
   public static final emf d = cwj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ic> e = ImmutableList.of(ic.a, ic.d, ic.c, ic.f, ic.e);

   @Override
   public MapCodec<day> a() {
      return a;
   }

   protected day(eei $$0, diz.d $$1) {
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
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : emc.a();
   }

   @Override
   public boolean e_(dja $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean a_(dja $$0, cso $$1, hx $$2) {
      return false;
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return !this.c.a(asg.b);
   }

   @Override
   public eek c_(dja $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dja $$0, dja $$1, ic $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   public dco b_(dja $$0) {
      return dco.a;
   }

   @Override
   public List<cmr> a(dja $$0, egv.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return emc.a();
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((ctl)$$1));
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((ctl)$$1));
      }
   }

   private boolean a(cti $$0, hx $$1, dja $$2) {
      if (this.c.a(asg.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cwl.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ic $$4 = (ic)var5.next();
            hx $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(asg.a)) {
               cwj $$6 = $$0.b_($$1).b() ? cwl.co : cwl.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cwl.mW)) {
               $$0.b($$1, cwl.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(ctj $$0, hx $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public cmr a(@Nullable cfb $$0, ctj $$1, hx $$2, dja $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cwl.a.o(), 11);
         return new cmr(this.c.a());
      } else {
         return cmr.f;
      }
   }

   @Override
   public Optional<arl> au_() {
      return this.c.j();
   }
}
