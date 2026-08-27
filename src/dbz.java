import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbz extends dbt implements dby {
   public static final MapCodec<dbz> a = b(dbz::new);

   @Override
   public MapCodec<dbz> a() {
      return a;
   }

   public dbz(dph.d $$0) {
      super($$0);
   }

   @Override
   public cql b() {
      return cql.a;
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dmj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$2, dmq.o, dmj::a);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         if ($$1.c_($$2) instanceof dmj $$5) {
            $$3.a($$5);
            $$3.a(auz.ab);
         }

         return bof.b;
      }
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }
}
