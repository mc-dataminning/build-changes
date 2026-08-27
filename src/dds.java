import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dds extends ddm implements ddr {
   public static final MapCodec<dds> a = b(dds::new);

   @Override
   public MapCodec<dds> a() {
      return a;
   }

   public dds(drc.d $$0) {
      super($$0);
   }

   @Override
   public csj b() {
      return csj.a;
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dod($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$2, dok.o, dod::a);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         if ($$1.c_($$2) instanceof dod $$5) {
            $$3.a($$5);
            $$3.a(avs.ab);
         }

         return bpw.b;
      }
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }
}
