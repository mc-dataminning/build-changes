import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dfd extends cwb {
   public static final MapCodec<dfd> a = b(dfd::new);
   public static final dke<dit> b = djw.by;

   @Override
   public MapCodec<dfd> a() {
      return a;
   }

   public dfd(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dit.a));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return new din($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return $$0 instanceof and $$3
         ? a($$2, dgw.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.d().b($$3, $$2x))
         : a($$2, dgw.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.d().a($$0x, $$1x));
   }

   @Override
   public void a(cmx $$0, @Nullable csu $$1, List<vf> $$2, cop $$3) {
      super.a($$0, $$1, $$2, $$3);
      cug.a($$0, $$2, "spawn_data");
   }
}
