import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eri {
   private doj a;
   private dqc b;
   private ji c;
   private boolean d;
   @Nullable
   private enc e;
   private eqw f;
   @Nullable
   private azg g;
   private int h;
   private final List<erj> i;
   private boolean j;
   private boolean k;

   public eri() {
      this.a = doj.a;
      this.b = dqc.a;
      this.c = ji.c;
      this.f = eqw.b;
      this.i = Lists.newArrayList();
   }

   public eri a() {
      eri $$0 = new eri();
      $$0.a = this.a;
      $$0.b = this.b;
      $$0.c = this.c;
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      $$0.h = this.h;
      $$0.i.addAll(this.i);
      $$0.j = this.j;
      $$0.k = this.k;
      return $$0;
   }

   public eri a(doj $$0) {
      this.a = $$0;
      return this;
   }

   public eri a(dqc $$0) {
      this.b = $$0;
      return this;
   }

   public eri a(ji $$0) {
      this.c = $$0;
      return this;
   }

   public eri a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public eri a(enc $$0) {
      this.e = $$0;
      return this;
   }

   public eri a(@Nullable azg $$0) {
      this.g = $$0;
      return this;
   }

   public eri a(eqw $$0) {
      this.f = $$0;
      return this;
   }

   public eri b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public eri b() {
      this.i.clear();
      return this;
   }

   public eri a(erj $$0) {
      this.i.add($$0);
      return this;
   }

   public eri b(erj $$0) {
      this.i.remove($$0);
      return this;
   }

   public doj c() {
      return this.a;
   }

   public dqc d() {
      return this.b;
   }

   public ji e() {
      return this.c;
   }

   public azg b(@Nullable ji $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azg.a(af.c()) : azg.a(ayy.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public enc g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<erj> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == eqw.b;
   }

   public erm.b a(List<erm.b> $$0, @Nullable ji $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public eri c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
