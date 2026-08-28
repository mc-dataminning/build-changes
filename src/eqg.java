import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eqg {
   private dnm a;
   private dpd b;
   private jh c;
   private boolean d;
   @Nullable
   private ema e;
   private epu f;
   @Nullable
   private azu g;
   private int h;
   private final List<eqh> i;
   private boolean j;
   private boolean k;

   public eqg() {
      this.a = dnm.a;
      this.b = dpd.a;
      this.c = jh.c;
      this.f = epu.b;
      this.i = Lists.newArrayList();
   }

   public eqg a() {
      eqg $$0 = new eqg();
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

   public eqg a(dnm $$0) {
      this.a = $$0;
      return this;
   }

   public eqg a(dpd $$0) {
      this.b = $$0;
      return this;
   }

   public eqg a(jh $$0) {
      this.c = $$0;
      return this;
   }

   public eqg a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public eqg a(ema $$0) {
      this.e = $$0;
      return this;
   }

   public eqg a(@Nullable azu $$0) {
      this.g = $$0;
      return this;
   }

   public eqg a(epu $$0) {
      this.f = $$0;
      return this;
   }

   public eqg b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public eqg b() {
      this.i.clear();
      return this;
   }

   public eqg a(eqh $$0) {
      this.i.add($$0);
      return this;
   }

   public eqg b(eqh $$0) {
      this.i.remove($$0);
      return this;
   }

   public dnm c() {
      return this.a;
   }

   public dpd d() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }

   public azu b(@Nullable jh $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azu.a(ae.c()) : azu.a(azm.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public ema g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<eqh> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == epu.b;
   }

   public eqk.a a(List<eqk.a> $$0, @Nullable jh $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public eqg c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
