import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnn extends dhj {
   public static final MapCodec<dnn> a = b(dnn::new);
   public static final dvf b = dno.d;

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(dun.d $$0) {
      super($$0);
      this.l(this.o().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      return this.o().b(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.C($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }
}
