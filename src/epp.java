import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class epp {
   private dmu a;
   private dol b;
   private jg c;
   private boolean d;
   @Nullable
   private elj e;
   private epd f;
   @Nullable
   private azr g;
   private int h;
   private final List<epq> i;
   private boolean j;
   private boolean k;

   public epp() {
      this.a = dmu.a;
      this.b = dol.a;
      this.c = jg.c;
      this.f = epd.b;
      this.i = Lists.newArrayList();
   }

   public epp a() {
      epp $$0 = new epp();
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

   public epp a(dmu $$0) {
      this.a = $$0;
      return this;
   }

   public epp a(dol $$0) {
      this.b = $$0;
      return this;
   }

   public epp a(jg $$0) {
      this.c = $$0;
      return this;
   }

   public epp a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public epp a(elj $$0) {
      this.e = $$0;
      return this;
   }

   public epp a(@Nullable azr $$0) {
      this.g = $$0;
      return this;
   }

   public epp a(epd $$0) {
      this.f = $$0;
      return this;
   }

   public epp b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public epp b() {
      this.i.clear();
      return this;
   }

   public epp a(epq $$0) {
      this.i.add($$0);
      return this;
   }

   public epp b(epq $$0) {
      this.i.remove($$0);
      return this;
   }

   public dmu c() {
      return this.a;
   }

   public dol d() {
      return this.b;
   }

   public jg e() {
      return this.c;
   }

   public azr b(@Nullable jg $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azr.a(ad.c()) : azr.a(azj.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public elj g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<epq> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == epd.b;
   }

   public ept.a a(List<ept.a> $$0, @Nullable jg $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public epp c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
