import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcw extends dcq implements dcv {
   public static final MapCodec<dcw> a = b(dcw::new);

   @Override
   public MapCodec<dcw> a() {
      return a;
   }

   public dcw(dqg.d $$0) {
      super($$0);
   }

   @Override
   public crs b() {
      return crs.a;
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$2, dno.o, dnh::a);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         if ($$1.c_($$2) instanceof dnh $$5) {
            $$3.a($$5);
            $$3.a(avm.ab);
         }

         return bpm.b;
      }
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }
}
