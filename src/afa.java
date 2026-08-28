import java.util.ArrayList;
import java.util.List;

public record afa(int c, List<akk.c<?>> d) implements zc<abr> {
   public static final yt<wg, afa> a = zc.a(afa::b, afa::new);
   public static final int b = 255;

   private afa(wg $$0) {
      this($$0.l(), a($$0));
   }

   private static void a(List<akk.c<?>> $$0, wg $$1) {
      for (akk.c<?> $$2 : $$0) {
         $$2.a($$1);
      }

      $$1.l(255);
   }

   private static List<akk.c<?>> a(wg $$0) {
      List<akk.c<?>> $$1 = new ArrayList<>();

      int $$2;
      while (($$2 = $$0.readUnsignedByte()) != 255) {
         $$1.add(akk.c.a($$0, $$2));
      }

      return $$1;
   }

   private void b(wg $$0) {
      $$0.c(this.c);
      a(this.d, $$0);
   }

   @Override
   public ze<afa> a() {
      return agk.aF;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<akk.c<?>> e() {
      return this.d;
   }
}
