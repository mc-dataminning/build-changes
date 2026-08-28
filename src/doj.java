import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class doj extends dqf implements dqs {
   public static final MapCodec<doj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwm.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, doj::new)
   );
   public static final dxw b = dxn.aw;
   public static final int c = 4;
   private static final fbu[] j = new fbu[]{
      djm.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      djm.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      djm.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      djm.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      djm.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dxo k = dxn.J;
   public static final dxo d = dxn.n;

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   public doj(dwm $$0, dww.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(djo.ee);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eta.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      fba $$4 = $$0.a($$2);
      fbu $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(djo.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(k)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return $$4 == jn.b && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(k) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if (!o($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!q($$0)) {
            $$1.a($$2, $$0.a(b), 2);
         }
      }
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dwx $$0) {
      return $$0.c(d);
   }

   private static boolean q(dwx $$0) {
      return $$0.c(b) == 4;
   }

   public static dwx c() {
      return b(0);
   }

   public static dwx b(int $$0) {
      return djo.H.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
