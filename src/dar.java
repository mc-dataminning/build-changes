import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dar extends cwb {
   public static final MapCodec<dar> a = b(dar::new);
   public static final djx b = djw.n;

   @Override
   public MapCodec<dar> a() {
      return a;
   }

   protected dar(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, @Nullable bmk $$3, cmx $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      sn $$5 = ckq.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dhv $$6) {
         $$6.k();
         return bka.a($$1.B);
      } else {
         return bka.d;
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dhv $$5) {
            $$5.k();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhv($$0, $$1);
   }

   @Override
   public boolean f_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      if ($$1.c_($$2) instanceof dhv $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhv $$3 && $$3.x().d() instanceof cnp $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return $$1.c(b) ? a($$2, dgw.e, dhv::a) : null;
   }
}
