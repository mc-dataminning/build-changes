import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dms extends dne {
   private static final fgm c = dne.b(14.0, 0.0, 0.5);
   private static final fgm d = dne.b(14.0, 0.0, 1.0);
   protected static final ffn a = dne.b(14.0, 0.0, 4.0).e().getFirst();
   protected final ebv b;

   protected dms(ebf.d $$0, ebv $$1) {
      super($$0.a($$1.g()));
      this.b = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dms> a();

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.h($$0) > 0 ? c : d;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(ebg $$0) {
      return true;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == jc.a && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jc.b);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if (!$$1.C) {
         int $$5 = this.h($$0);
         if ($$5 == 0) {
            this.a($$3, $$1, $$2, $$0, $$5);
         }
      }
   }

   private void a(@Nullable bwv $$0, djz $$1, iw $$2, ebg $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         ebg $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.b.l(), aws.e);
         $$1.a($$0, egg.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.b.m(), aws.e);
         $$1.a($$0, egg.a, $$2);
      }

      if ($$7) {
         $$1.a(new iw($$2), this, this.b());
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      if (!$$3 && this.h($$0) > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(djz $$0, iw $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$3 == jc.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   protected static int a(djz $$0, ffn $$1, Class<? extends bwv> $$2) {
      return $$0.a($$2, $$1, bxc.f.and($$0x -> !$$0x.g_())).size();
   }

   protected abstract int b(djz var1, iw var2);

   protected abstract int h(ebg var1);

   protected abstract ebg a(ebg var1, int var2);
}
