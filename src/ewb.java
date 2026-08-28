import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ewb {
   private dsh a;
   private dty b;
   private iw c;
   private boolean d;
   @Nullable
   private erv e;
   private evp f;
   @Nullable
   private azz g;
   private int h;
   private final List<ewc> i;
   private boolean j;
   private boolean k;

   public ewb() {
      this.a = dsh.a;
      this.b = dty.a;
      this.c = iw.c;
      this.f = evp.b;
      this.i = Lists.newArrayList();
   }

   public ewb a() {
      ewb $$0 = new ewb();
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

   public ewb a(dsh $$0) {
      this.a = $$0;
      return this;
   }

   public ewb a(dty $$0) {
      this.b = $$0;
      return this;
   }

   public ewb a(iw $$0) {
      this.c = $$0;
      return this;
   }

   public ewb a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ewb a(erv $$0) {
      this.e = $$0;
      return this;
   }

   public ewb a(@Nullable azz $$0) {
      this.g = $$0;
      return this;
   }

   public ewb a(evp $$0) {
      this.f = $$0;
      return this;
   }

   public ewb b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ewb b() {
      this.i.clear();
      return this;
   }

   public ewb a(ewc $$0) {
      this.i.add($$0);
      return this;
   }

   public ewb b(ewc $$0) {
      this.i.remove($$0);
      return this;
   }

   public dsh c() {
      return this.a;
   }

   public dty d() {
      return this.b;
   }

   public iw e() {
      return this.c;
   }

   public azz b(@Nullable iw $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azz.a(ag.c()) : azz.a(azq.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public erv g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<ewc> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == evp.b;
   }

   public ewf.b a(List<ewf.b> $$0, @Nullable iw $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ewb c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
