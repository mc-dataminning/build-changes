import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class egc {
   private deb a;
   private dfr b;
   private ib c;
   private boolean d;
   @Nullable
   private eby e;
   private boolean f;
   @Nullable
   private awt g;
   private int h;
   private final List<egd> i;
   private boolean j;
   private boolean k;

   public egc() {
      this.a = deb.a;
      this.b = dfr.a;
      this.c = ib.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public egc a() {
      egc $$0 = new egc();
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

   public egc a(deb $$0) {
      this.a = $$0;
      return this;
   }

   public egc a(dfr $$0) {
      this.b = $$0;
      return this;
   }

   public egc a(ib $$0) {
      this.c = $$0;
      return this;
   }

   public egc a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public egc a(eby $$0) {
      this.e = $$0;
      return this;
   }

   public egc a(@Nullable awt $$0) {
      this.g = $$0;
      return this;
   }

   public egc b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public egc c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public egc b() {
      this.i.clear();
      return this;
   }

   public egc a(egd $$0) {
      this.i.add($$0);
      return this;
   }

   public egc b(egd $$0) {
      this.i.remove($$0);
      return this;
   }

   public deb c() {
      return this.a;
   }

   public dfr d() {
      return this.b;
   }

   public ib e() {
      return this.c;
   }

   public awt b(@Nullable ib $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? awt.a(ac.b()) : awt.a(awm.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eby g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<egd> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public egg.a a(List<egg.a> $$0, @Nullable ib $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public egc d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
