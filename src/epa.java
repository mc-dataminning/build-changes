import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class epa {
   private dmg a;
   private dnx b;
   private je c;
   private boolean d;
   @Nullable
   private eku e;
   private eoo f;
   @Nullable
   private azl g;
   private int h;
   private final List<epb> i;
   private boolean j;
   private boolean k;

   public epa() {
      this.a = dmg.a;
      this.b = dnx.a;
      this.c = je.c;
      this.f = eoo.b;
      this.i = Lists.newArrayList();
   }

   public epa a() {
      epa $$0 = new epa();
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

   public epa a(dmg $$0) {
      this.a = $$0;
      return this;
   }

   public epa a(dnx $$0) {
      this.b = $$0;
      return this;
   }

   public epa a(je $$0) {
      this.c = $$0;
      return this;
   }

   public epa a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public epa a(eku $$0) {
      this.e = $$0;
      return this;
   }

   public epa a(@Nullable azl $$0) {
      this.g = $$0;
      return this;
   }

   public epa a(eoo $$0) {
      this.f = $$0;
      return this;
   }

   public epa b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public epa b() {
      this.i.clear();
      return this;
   }

   public epa a(epb $$0) {
      this.i.add($$0);
      return this;
   }

   public epa b(epb $$0) {
      this.i.remove($$0);
      return this;
   }

   public dmg c() {
      return this.a;
   }

   public dnx d() {
      return this.b;
   }

   public je e() {
      return this.c;
   }

   public azl b(@Nullable je $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azl.a(ad.c()) : azl.a(azd.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eku g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<epb> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == eoo.b;
   }

   public epe.a a(List<epe.a> $$0, @Nullable je $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public epa c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
