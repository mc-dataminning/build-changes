import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class epe {
   private dmj a;
   private doa b;
   private jf c;
   private boolean d;
   @Nullable
   private eky e;
   private eos f;
   @Nullable
   private azn g;
   private int h;
   private final List<epf> i;
   private boolean j;
   private boolean k;

   public epe() {
      this.a = dmj.a;
      this.b = doa.a;
      this.c = jf.c;
      this.f = eos.b;
      this.i = Lists.newArrayList();
   }

   public epe a() {
      epe $$0 = new epe();
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

   public epe a(dmj $$0) {
      this.a = $$0;
      return this;
   }

   public epe a(doa $$0) {
      this.b = $$0;
      return this;
   }

   public epe a(jf $$0) {
      this.c = $$0;
      return this;
   }

   public epe a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public epe a(eky $$0) {
      this.e = $$0;
      return this;
   }

   public epe a(@Nullable azn $$0) {
      this.g = $$0;
      return this;
   }

   public epe a(eos $$0) {
      this.f = $$0;
      return this;
   }

   public epe b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public epe b() {
      this.i.clear();
      return this;
   }

   public epe a(epf $$0) {
      this.i.add($$0);
      return this;
   }

   public epe b(epf $$0) {
      this.i.remove($$0);
      return this;
   }

   public dmj c() {
      return this.a;
   }

   public doa d() {
      return this.b;
   }

   public jf e() {
      return this.c;
   }

   public azn b(@Nullable jf $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azn.a(ad.c()) : azn.a(azf.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eky g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<epf> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == eos.b;
   }

   public epi.a a(List<epi.a> $$0, @Nullable jf $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public epe c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
