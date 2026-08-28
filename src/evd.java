import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class evd extends ewa {
   public static final MapCodec<evd> a = Codec.FLOAT.fieldOf("mossiness").xmap(evd::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final ebe[] e = new ebe[]{dne.kg.m(), dne.kn.m()};
   private final float f;

   public evd(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ewd.d a(dka $$0, iv $$1, iv $$2, ewd.d $$3, ewd.d $$4, evz $$5) {
      azx $$6 = $$5.b($$4.a());
      ebe $$7 = $$4.b();
      iv $$8 = $$4.a();
      ebe $$9 = null;
      if ($$7.a(dne.eZ) || $$7.a(dne.b) || $$7.a(dne.fc)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axe.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axe.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axe.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dne.cy)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ewd.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private ebe a(azx $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         ebe[] $$1 = new ebe[]{dne.fb.m(), a($$0, dne.fC)};
         ebe[] $$2 = new ebe[]{dne.fa.m(), a($$0, dne.nM)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private ebe a(azx $$0, ebe $$1) {
      jb $$2 = $$1.c(dvg.b);
      ecd $$3 = $$1.c(dvg.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         ebe[] $$4 = new ebe[]{dne.nM.m().b(dvg.b, $$2).b(dvg.c, $$3), dne.oa.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private ebe b(azx $$0) {
      return $$0.i() < this.f ? dne.oa.m() : null;
   }

   @Nullable
   private ebe c(azx $$0) {
      return $$0.i() < this.f ? dne.oo.m() : null;
   }

   @Nullable
   private ebe d(azx $$0) {
      return $$0.i() < 0.15F ? dne.pS.m() : null;
   }

   private static ebe a(azx $$0, dnc $$1) {
      return $$1.m().b(dvg.b, jb.c.a.a($$0)).b(dvg.c, ag.a(ecd.values(), $$0));
   }

   private ebe a(azx $$0, ebe[] $$1, ebe[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static ebe a(azx $$0, ebe[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ewc<?> a() {
      return ewc.k;
   }
}
