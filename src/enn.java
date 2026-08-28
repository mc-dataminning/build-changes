import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class enn {
   private dkv a;
   private dmm b;
   private jd c;
   private boolean d;
   @Nullable
   private ejh e;
   private enb f;
   @Nullable
   private ayw g;
   private int h;
   private final List<eno> i;
   private boolean j;
   private boolean k;

   public enn() {
      this.a = dkv.a;
      this.b = dmm.a;
      this.c = jd.c;
      this.f = enb.b;
      this.i = Lists.newArrayList();
   }

   public enn a() {
      enn $$0 = new enn();
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

   public enn a(dkv $$0) {
      this.a = $$0;
      return this;
   }

   public enn a(dmm $$0) {
      this.b = $$0;
      return this;
   }

   public enn a(jd $$0) {
      this.c = $$0;
      return this;
   }

   public enn a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public enn a(ejh $$0) {
      this.e = $$0;
      return this;
   }

   public enn a(@Nullable ayw $$0) {
      this.g = $$0;
      return this;
   }

   public enn a(enb $$0) {
      this.f = $$0;
      return this;
   }

   public enn b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public enn b() {
      this.i.clear();
      return this;
   }

   public enn a(eno $$0) {
      this.i.add($$0);
      return this;
   }

   public enn b(eno $$0) {
      this.i.remove($$0);
      return this;
   }

   public dkv c() {
      return this.a;
   }

   public dmm d() {
      return this.b;
   }

   public jd e() {
      return this.c;
   }

   public ayw b(@Nullable jd $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? ayw.a(ad.c()) : ayw.a(ayo.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public ejh g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<eno> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == enb.b;
   }

   public enr.a a(List<enr.a> $$0, @Nullable jd $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public enn c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
