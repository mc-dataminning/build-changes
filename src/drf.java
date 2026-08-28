import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class drf extends diy {
   public static final MapCodec<drf> a = b(drf::new);

   @Override
   public MapCodec<drf> a() {
      return a;
   }

   protected drf(dww.d $$0) {
      super($$0);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return a($$2, dub.j, $$0.C ? dvq::a : dvq::b);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, cwp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wo> $$2, cyh $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhd.a($$0, $$2, "SpawnData");
   }
}
