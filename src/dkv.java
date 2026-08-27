import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dkv extends dbt {
   public static final MapCodec<dkv> a = b(dkv::new);
   public static final dqg<doo> b = dpy.by;

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   public dkv(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, doo.a));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new doi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return $$0 instanceof apu $$3
         ? a($$2, dmq.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().b($$3, $$2x))
         : a($$2, dmq.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x));
   }

   @Override
   public void a(crs $$0, @Nullable cym $$1, List<wi> $$2, cti $$3, @Nullable jb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      czy.a($$0, $$2, "spawn_data");
   }
}
