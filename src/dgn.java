import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgn extends dgh implements dgm {
   public static final MapCodec<dgn> a = b(dgn::new);

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   public dgn(dtz.d $$0) {
      super($$0);
   }

   @Override
   public cue b() {
      return cue.a;
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dqz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$2, drg.o, dqz::a);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dqz $$5) {
         $$3.a($$5);
         $$3.a(awn.ab);
      }

      return brk.a;
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }
}
