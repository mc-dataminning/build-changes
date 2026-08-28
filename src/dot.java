import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dot extends diq {
   public static final MapCodec<dot> a = b(dot::new);
   public static final dwm b = dou.d;

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   public dot(dvu.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
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
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }
}
