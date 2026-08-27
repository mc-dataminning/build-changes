import com.mojang.serialization.Codec;

public class efa extends eew {
   public static final Codec<efa> a = awu.j.fieldOf("chance").xmap(efa::new, $$0 -> $$0.c).codec();
   private final int c;

   private efa(int $$0) {
      this.c = $$0;
   }

   public static efa a(int $$0) {
      return new efa($$0);
   }

   @Override
   protected boolean a(eev $$0, axt $$1, id $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eey<?> b() {
      return eey.b;
   }
}
