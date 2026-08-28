import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eqo extends erl {
   public static final MapCodec<eqo> a = Codec.FLOAT.fieldOf("mossiness").xmap(eqo::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dwx[] e = new dwx[]{djo.kc.m(), djo.kj.m()};
   private final float f;

   public eqo(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ero.d a(dgl $$0, ji $$1, ji $$2, ero.d $$3, ero.d $$4, erk $$5) {
      azh $$6 = $$5.b($$4.a());
      dwx $$7 = $$4.b();
      ji $$8 = $$4.a();
      dwx $$9 = null;
      if ($$7.a(djo.eV) || $$7.a(djo.b) || $$7.a(djo.eY)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awp.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awp.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awp.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(djo.cv)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ero.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dwx a(azh $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dwx[] $$1 = new dwx[]{djo.eX.m(), a($$0, djo.fy)};
         dwx[] $$2 = new dwx[]{djo.eW.m(), a($$0, djo.nI)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dwx a(azh $$0, dwx $$1) {
      jn $$2 = $$1.c(drl.b);
      dxv $$3 = $$1.c(drl.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dwx[] $$4 = new dwx[]{djo.nI.m().b(drl.b, $$2).b(drl.c, $$3), djo.nW.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dwx b(azh $$0) {
      return $$0.i() < this.f ? djo.nW.m() : null;
   }

   @Nullable
   private dwx c(azh $$0) {
      return $$0.i() < this.f ? djo.ok.m() : null;
   }

   @Nullable
   private dwx d(azh $$0) {
      return $$0.i() < 0.15F ? djo.pM.m() : null;
   }

   private static dwx a(azh $$0, djm $$1) {
      return $$1.m().b(drl.b, jn.c.a.a($$0)).b(drl.c, af.a(dxv.values(), $$0));
   }

   private dwx a(azh $$0, dwx[] $$1, dwx[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dwx a(azh $$0, dwx[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ern<?> a() {
      return ern.k;
   }
}
