import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ete {
   private dpv a;
   private drm b;
   private jj c;
   private boolean d;
   @Nullable
   private eoy e;
   private ess f;
   @Nullable
   private azs g;
   private int h;
   private final List<etf> i;
   private boolean j;
   private boolean k;

   public ete() {
      this.a = dpv.a;
      this.b = drm.a;
      this.c = jj.c;
      this.f = ess.b;
      this.i = Lists.newArrayList();
   }

   public ete a() {
      ete $$0 = new ete();
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

   public ete a(dpv $$0) {
      this.a = $$0;
      return this;
   }

   public ete a(drm $$0) {
      this.b = $$0;
      return this;
   }

   public ete a(jj $$0) {
      this.c = $$0;
      return this;
   }

   public ete a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ete a(eoy $$0) {
      this.e = $$0;
      return this;
   }

   public ete a(@Nullable azs $$0) {
      this.g = $$0;
      return this;
   }

   public ete a(ess $$0) {
      this.f = $$0;
      return this;
   }

   public ete b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ete b() {
      this.i.clear();
      return this;
   }

   public ete a(etf $$0) {
      this.i.add($$0);
      return this;
   }

   public ete b(etf $$0) {
      this.i.remove($$0);
      return this;
   }

   public dpv c() {
      return this.a;
   }

   public drm d() {
      return this.b;
   }

   public jj e() {
      return this.c;
   }

   public azs b(@Nullable jj $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azs.a(af.c()) : azs.a(azk.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eoy g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<etf> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == ess.b;
   }

   public eti.b a(List<eti.b> $$0, @Nullable jj $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ete c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
