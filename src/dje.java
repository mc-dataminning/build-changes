import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dje extends diy implements djd {
   public static final MapCodec<dje> a = b(dje::new);

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   public dje(dww.d $$0) {
      super($$0);
   }

   @Override
   public cvm b() {
      return cvm.a;
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dtu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return a($$2, dub.p, dtu::a);
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtu $$5) {
         $$3.a($$5);
         $$3.a(awk.ab);
      }

      return bsk.a;
   }
}
