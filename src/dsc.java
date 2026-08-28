import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsc extends dlu {
   public static final MapCodec<dsc> a = b(dsc::new);
   public static final eaf b = dsd.b;

   @Override
   public MapCodec<dsc> a() {
      return a;
   }

   public dsc(dzn.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.D($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$0.c(b) && !$$1.D($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }
}
