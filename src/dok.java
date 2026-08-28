import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dok extends dgh {
   public static final MapCodec<dok> a = b(dok::new);

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   protected dok(dtz.d $$0) {
      super($$0);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$2, drg.j, $$0.B ? dsu::a : dsu::b);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, cvl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      super.a($$0, $$1, $$2, $$3);
      dem.a($$0, $$2, "SpawnData");
   }
}
