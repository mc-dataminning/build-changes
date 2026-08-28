import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class esb {
   private dpc a;
   private dqv b;
   private jh c;
   private boolean d;
   @Nullable
   private env e;
   private erp f;
   @Nullable
   private bac g;
   private int h;
   private final List<esc> i;
   private boolean j;
   private boolean k;

   public esb() {
      this.a = dpc.a;
      this.b = dqv.a;
      this.c = jh.c;
      this.f = erp.b;
      this.i = Lists.newArrayList();
   }

   public esb a() {
      esb $$0 = new esb();
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

   public esb a(dpc $$0) {
      this.a = $$0;
      return this;
   }

   public esb a(dqv $$0) {
      this.b = $$0;
      return this;
   }

   public esb a(jh $$0) {
      this.c = $$0;
      return this;
   }

   public esb a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public esb a(env $$0) {
      this.e = $$0;
      return this;
   }

   public esb a(@Nullable bac $$0) {
      this.g = $$0;
      return this;
   }

   public esb a(erp $$0) {
      this.f = $$0;
      return this;
   }

   public esb b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public esb b() {
      this.i.clear();
      return this;
   }

   public esb a(esc $$0) {
      this.i.add($$0);
      return this;
   }

   public esb b(esc $$0) {
      this.i.remove($$0);
      return this;
   }

   public dpc c() {
      return this.a;
   }

   public dqv d() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }

   public bac b(@Nullable jh $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? bac.a(ae.c()) : bac.a(azu.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public env g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<esc> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == erp.b;
   }

   public esf.b a(List<esf.b> $$0, @Nullable jh $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public esb c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
