import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class enp {
   private dkv a;
   private dmm b;
   private jd c;
   private boolean d;
   @Nullable
   private ejj e;
   private end f;
   @Nullable
   private ayw g;
   private int h;
   private final List<enq> i;
   private boolean j;
   private boolean k;

   public enp() {
      this.a = dkv.a;
      this.b = dmm.a;
      this.c = jd.c;
      this.f = end.b;
      this.i = Lists.newArrayList();
   }

   public enp a() {
      enp $$0 = new enp();
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

   public enp a(dkv $$0) {
      this.a = $$0;
      return this;
   }

   public enp a(dmm $$0) {
      this.b = $$0;
      return this;
   }

   public enp a(jd $$0) {
      this.c = $$0;
      return this;
   }

   public enp a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public enp a(ejj $$0) {
      this.e = $$0;
      return this;
   }

   public enp a(@Nullable ayw $$0) {
      this.g = $$0;
      return this;
   }

   public enp a(end $$0) {
      this.f = $$0;
      return this;
   }

   public enp b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public enp b() {
      this.i.clear();
      return this;
   }

   public enp a(enq $$0) {
      this.i.add($$0);
      return this;
   }

   public enp b(enq $$0) {
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
   public ejj g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<enq> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == end.b;
   }

   public ent.a a(List<ent.a> $$0, @Nullable jd $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public enp c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
