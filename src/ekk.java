import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ekk extends elg {
   public static final MapCodec<ekk> a = Codec.FLOAT.fieldOf("mossiness").xmap(ekk::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final drb[] e = new drb[]{dea.jD.n(), dea.jK.n()};
   private final float f;

   public ekk(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public elj.c a(dba $$0, io $$1, io $$2, elj.c $$3, elj.c $$4, elf $$5) {
      ayk $$6 = $$5.b($$4.a());
      drb $$7 = $$4.b();
      io $$8 = $$4.a();
      drb $$9 = null;
      if ($$7.a(dea.eH) || $$7.a(dea.b) || $$7.a(dea.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(avw.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(avw.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(avw.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dea.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new elj.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private drb a(ayk $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         drb[] $$1 = new drb[]{dea.eJ.n(), a($$0, dea.fj)};
         drb[] $$2 = new drb[]{dea.eI.n(), a($$0, dea.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private drb a(ayk $$0, drb $$1) {
      it $$2 = $$1.c(dls.b);
      dsa $$3 = $$1.c(dls.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         drb[] $$4 = new drb[]{dea.ng.n().a(dls.b, $$2).a(dls.c, $$3), dea.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private drb b(ayk $$0) {
      return $$0.i() < this.f ? dea.nu.n() : null;
   }

   @Nullable
   private drb c(ayk $$0) {
      return $$0.i() < this.f ? dea.nI.n() : null;
   }

   @Nullable
   private drb d(ayk $$0) {
      return $$0.i() < 0.15F ? dea.pk.n() : null;
   }

   private static drb a(ayk $$0, ddy $$1) {
      return $$1.n().a(dls.b, it.c.a.a($$0)).a(dls.c, ac.a(dsa.values(), $$0));
   }

   private drb a(ayk $$0, drb[] $$1, drb[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static drb a(ayk $$0, drb[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eli<?> a() {
      return eli.k;
   }
}
