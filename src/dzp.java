import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dzp {
   private cyv a;
   private dal b;
   private ht c;
   private boolean d;
   @Nullable
   private dvs e;
   private boolean f;
   @Nullable
   private ate g;
   private int h;
   private final List<dzq> i;
   private boolean j;
   private boolean k;

   public dzp() {
      this.a = cyv.a;
      this.b = dal.a;
      this.c = ht.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public dzp a() {
      dzp $$0 = new dzp();
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

   public dzp a(cyv $$0) {
      this.a = $$0;
      return this;
   }

   public dzp a(dal $$0) {
      this.b = $$0;
      return this;
   }

   public dzp a(ht $$0) {
      this.c = $$0;
      return this;
   }

   public dzp a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public dzp a(dvs $$0) {
      this.e = $$0;
      return this;
   }

   public dzp a(@Nullable ate $$0) {
      this.g = $$0;
      return this;
   }

   public dzp b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public dzp c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public dzp b() {
      this.i.clear();
      return this;
   }

   public dzp a(dzq $$0) {
      this.i.add($$0);
      return this;
   }

   public dzp b(dzq $$0) {
      this.i.remove($$0);
      return this;
   }

   public cyv c() {
      return this.a;
   }

   public dal d() {
      return this.b;
   }

   public ht e() {
      return this.c;
   }

   public ate b(@Nullable ht $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? ate.a(ac.b()) : ate.a(asy.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dvs g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<dzq> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public dzt.a a(List<dzt.a> $$0, @Nullable ht $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public dzp d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
