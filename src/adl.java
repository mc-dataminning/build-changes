import java.util.BitSet;
import javax.annotation.Nullable;

public class adl implements zh<abw> {
   public static final yy<vw, adl> a = zh.a(adl::a, adl::new);
   private final int b;
   private final int c;
   private final adm d;

   public adl(djc $$0, exd $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.h;
      this.c = $$0.i;
      this.d = new adm($$0, $$1, $$2, $$3);
   }

   private adl(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adm($$0, this.b, this.c);
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zj<adl> a() {
      return agp.N;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adm f() {
      return this.d;
   }
}
