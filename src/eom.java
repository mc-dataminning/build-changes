import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eom {
   private dls a;
   private dnj b;
   private je c;
   private boolean d;
   @Nullable
   private ekg e;
   private eoa f;
   @Nullable
   private azk g;
   private int h;
   private final List<eon> i;
   private boolean j;
   private boolean k;

   public eom() {
      this.a = dls.a;
      this.b = dnj.a;
      this.c = je.c;
      this.f = eoa.b;
      this.i = Lists.newArrayList();
   }

   public eom a() {
      eom $$0 = new eom();
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

   public eom a(dls $$0) {
      this.a = $$0;
      return this;
   }

   public eom a(dnj $$0) {
      this.b = $$0;
      return this;
   }

   public eom a(je $$0) {
      this.c = $$0;
      return this;
   }

   public eom a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public eom a(ekg $$0) {
      this.e = $$0;
      return this;
   }

   public eom a(@Nullable azk $$0) {
      this.g = $$0;
      return this;
   }

   public eom a(eoa $$0) {
      this.f = $$0;
      return this;
   }

   public eom b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public eom b() {
      this.i.clear();
      return this;
   }

   public eom a(eon $$0) {
      this.i.add($$0);
      return this;
   }

   public eom b(eon $$0) {
      this.i.remove($$0);
      return this;
   }

   public dls c() {
      return this.a;
   }

   public dnj d() {
      return this.b;
   }

   public je e() {
      return this.c;
   }

   public azk b(@Nullable je $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azk.a(ad.c()) : azk.a(azc.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public ekg g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<eon> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == eoa.b;
   }

   public eoq.a a(List<eoq.a> $$0, @Nullable je $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public eom c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
