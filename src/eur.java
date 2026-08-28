import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eur {
   private drc a;
   private dst b;
   private iu c;
   private boolean d;
   @Nullable
   private eql e;
   private euf f;
   @Nullable
   private azv g;
   private int h;
   private final List<eus> i;
   private boolean j;
   private boolean k;

   public eur() {
      this.a = drc.a;
      this.b = dst.a;
      this.c = iu.c;
      this.f = euf.b;
      this.i = Lists.newArrayList();
   }

   public eur a() {
      eur $$0 = new eur();
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

   public eur a(drc $$0) {
      this.a = $$0;
      return this;
   }

   public eur a(dst $$0) {
      this.b = $$0;
      return this;
   }

   public eur a(iu $$0) {
      this.c = $$0;
      return this;
   }

   public eur a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public eur a(eql $$0) {
      this.e = $$0;
      return this;
   }

   public eur a(@Nullable azv $$0) {
      this.g = $$0;
      return this;
   }

   public eur a(euf $$0) {
      this.f = $$0;
      return this;
   }

   public eur b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public eur b() {
      this.i.clear();
      return this;
   }

   public eur a(eus $$0) {
      this.i.add($$0);
      return this;
   }

   public eur b(eus $$0) {
      this.i.remove($$0);
      return this;
   }

   public drc c() {
      return this.a;
   }

   public dst d() {
      return this.b;
   }

   public iu e() {
      return this.c;
   }

   public azv b(@Nullable iu $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azv.a(af.c()) : azv.a(azm.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eql g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<eus> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == euf.b;
   }

   public euv.b a(List<euv.b> $$0, @Nullable iu $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public eur c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
