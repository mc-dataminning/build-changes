import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class del extends cwk {
   public static final MapCodec<del> a = b(del::new);

   @Override
   public MapCodec<del> a() {
      return a;
   }

   protected del(djo.d $$0) {
      super($$0);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new diq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$2, dhf.j, $$0.B ? diq::a : diq::b);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, cng $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public void a(cng $$0, @Nullable ctd $$1, List<vg> $$2, coy $$3) {
      super.a($$0, $$1, $$2, $$3);
      cup.a($$0, $$2, "SpawnData");
   }
}
