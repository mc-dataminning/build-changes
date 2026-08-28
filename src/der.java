import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class der extends del implements deq {
   public static final MapCodec<der> a = b(der::new);

   @Override
   public MapCodec<der> a() {
      return a;
   }

   public der(dsb.d $$0) {
      super($$0);
   }

   @Override
   public cti b() {
      return cti.a;
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return a($$2, dpj.o, dpc::a);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         if ($$1.c_($$2) instanceof dpc $$5) {
            $$3.a($$5);
            $$3.a(awk.ab);
         }

         return bqu.c;
      }
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }
}
