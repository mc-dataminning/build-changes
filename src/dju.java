import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dju extends dbt {
   public static final MapCodec<dju> a = b(dju::new);

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   protected dju(dph.d $$0) {
      super($$0);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new doc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$2, dmq.j, $$0.B ? doc::a : doc::b);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, crs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   public void a(crs $$0, @Nullable cym $$1, List<wi> $$2, cti $$3, @Nullable jb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      czy.a($$0, $$2, "SpawnData");
   }
}
