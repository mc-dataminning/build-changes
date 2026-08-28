import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dji extends der {
   public static final MapCodec<dji> a = b(dji::new);
   public static final dsy b = dsx.n;

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   protected dji(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, @Nullable bsy $$3, cua $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cwo $$5 = $$4.a(kn.O, cwo.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dqo $$5) {
         $$5.l();
         return bqd.a($$1.B);
      } else {
         return bqd.e;
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dqo $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqo($$0, $$1);
   }

   @Override
   public boolean e_(dsh $$0) {
      return true;
   }

   @Override
   public int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      if ($$1.c_($$2) instanceof dqo $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqo $$3 && $$3.f().g() instanceof cuv $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return $$1.c(b) ? a($$2, dpp.e, dqo::a) : null;
   }
}
