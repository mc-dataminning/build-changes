import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dec extends cwb {
   public static final MapCodec<dec> a = b(dec::new);

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   protected dec(djf.d $$0) {
      super($$0);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dih($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$2, dgw.j, $$0.B ? dih::a : dih::b);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, cmx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public void a(cmx $$0, @Nullable csu $$1, List<vf> $$2, cop $$3) {
      super.a($$0, $$1, $$2, $$3);
      cug.a($$0, $$2, "SpawnData");
   }
}
