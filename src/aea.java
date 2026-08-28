import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aea implements yw<abl> {
   public static final yn<vl, aea> a = yw.a(aea::a, aea::new);
   private final IntList b;

   public aea(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aea(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aea(vl $$0) {
      this.b = $$0.a();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
   }

   @Override
   public yy<aea> a() {
      return agd.am;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
