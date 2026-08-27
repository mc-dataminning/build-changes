import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ejd {
   private dgu a;
   private dik b;
   private ib c;
   private boolean d;
   @Nullable
   private eez e;
   private boolean f;
   @Nullable
   private axr g;
   private int h;
   private final List<eje> i;
   private boolean j;
   private boolean k;

   public ejd() {
      this.a = dgu.a;
      this.b = dik.a;
      this.c = ib.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public ejd a() {
      ejd $$0 = new ejd();
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

   public ejd a(dgu $$0) {
      this.a = $$0;
      return this;
   }

   public ejd a(dik $$0) {
      this.b = $$0;
      return this;
   }

   public ejd a(ib $$0) {
      this.c = $$0;
      return this;
   }

   public ejd a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ejd a(eez $$0) {
      this.e = $$0;
      return this;
   }

   public ejd a(@Nullable axr $$0) {
      this.g = $$0;
      return this;
   }

   public ejd b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public ejd c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ejd b() {
      this.i.clear();
      return this;
   }

   public ejd a(eje $$0) {
      this.i.add($$0);
      return this;
   }

   public ejd b(eje $$0) {
      this.i.remove($$0);
      return this;
   }

   public dgu c() {
      return this.a;
   }

   public dik d() {
      return this.b;
   }

   public ib e() {
      return this.c;
   }

   public axr b(@Nullable ib $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? axr.a(ac.b()) : axr.a(axk.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eez g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<eje> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public ejh.a a(List<ejh.a> $$0, @Nullable ib $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ejd d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
