import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emu extends enq {
   public static final Codec<emu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.f), Codec.BOOL.optionalFieldOf("potato", false).forGetter($$0x -> $$0x.g))
            .apply($$0, emu::new)
   );
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dtc[] e = new dtc[]{dfe.kx.n(), dfe.kE.n()};
   private final float f;
   private final boolean g;

   public emu(float $$0, boolean $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Nullable
   @Override
   public ent.c a(dcd $$0, ir $$1, ir $$2, ent.c $$3, ent.c $$4, enp $$5) {
      ayt $$6 = $$5.b($$4.a());
      dtc $$7 = $$4.b();
      ir $$8 = $$4.a();
      dtc $$9 = null;
      if (this.g) {
         if ($$7.a(dfe.r) || $$7.a(dfe.n)) {
            $$9 = this.b($$6);
         }
      } else if ($$7.a(dfe.fz) || $$7.a(dfe.b) || $$7.a(dfe.fC)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awe.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awe.K)) {
         $$9 = this.c($$6);
      } else if ($$7.a(awe.L)) {
         $$9 = this.d($$6);
      } else if ($$7.a(dfe.cZ)) {
         $$9 = this.e($$6);
      }

      return $$9 != null ? new ent.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dtc a(ayt $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dtc[] $$1 = new dtc[]{dfe.fB.n(), a($$0, dfe.gb)};
         dtc[] $$2 = new dtc[]{dfe.fA.n(), a($$0, dfe.oe)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dtc b(ayt $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dtc[] $$1 = new dtc[]{dfe.s.n()};
         dtc[] $$2 = new dtc[]{dfe.t.n()};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dtc a(ayt $$0, dtc $$1) {
      iw $$2 = $$1.c(dnk.b);
      dub $$3 = $$1.c(dnk.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dtc[] $$4 = new dtc[]{dfe.oe.n().a(dnk.b, $$2).a(dnk.c, $$3), dfe.os.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dtc c(ayt $$0) {
      return $$0.i() < this.f ? dfe.os.n() : null;
   }

   @Nullable
   private dtc d(ayt $$0) {
      return $$0.i() < this.f ? dfe.oG.n() : null;
   }

   @Nullable
   private dtc e(ayt $$0) {
      return $$0.i() < 0.15F ? dfe.qv.n() : null;
   }

   private static dtc a(ayt $$0, dfc $$1) {
      return $$1.n().a(dnk.b, iw.c.a.a($$0)).a(dnk.c, ad.a(dub.values(), $$0));
   }

   private dtc a(ayt $$0, dtc[] $$1, dtc[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dtc a(ayt $$0, dtc[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ens<?> a() {
      return ens.k;
   }
}
