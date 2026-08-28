import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dob extends dhy {
   public static final MapCodec<dob> a = b(dob::new);
   public static final dvu b = doc.d;

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   public dob(dvc.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if (!$$1.C) {
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
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }
}
