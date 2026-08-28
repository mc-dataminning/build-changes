import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class ael implements zh<abw> {
   public static final yy<vw, ael> a = zh.a(ael::a, ael::new);
   private final IntList b;

   public ael(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public ael(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private ael(vw $$0) {
      this.b = $$0.a();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
   }

   @Override
   public zj<ael> a() {
      return agp.an;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
