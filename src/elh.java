import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class elh {
   private dix a;
   private dkn b;
   private io c;
   private boolean d;
   @Nullable
   private ehd e;
   private boolean f;
   @Nullable
   private aym g;
   private int h;
   private final List<eli> i;
   private boolean j;
   private boolean k;

   public elh() {
      this.a = dix.a;
      this.b = dkn.a;
      this.c = io.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public elh a() {
      elh $$0 = new elh();
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

   public elh a(dix $$0) {
      this.a = $$0;
      return this;
   }

   public elh a(dkn $$0) {
      this.b = $$0;
      return this;
   }

   public elh a(io $$0) {
      this.c = $$0;
      return this;
   }

   public elh a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public elh a(ehd $$0) {
      this.e = $$0;
      return this;
   }

   public elh a(@Nullable aym $$0) {
      this.g = $$0;
      return this;
   }

   public elh b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public elh c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public elh b() {
      this.i.clear();
      return this;
   }

   public elh a(eli $$0) {
      this.i.add($$0);
      return this;
   }

   public elh b(eli $$0) {
      this.i.remove($$0);
      return this;
   }

   public dix c() {
      return this.a;
   }

   public dkn d() {
      return this.b;
   }

   public io e() {
      return this.c;
   }

   public aym b(@Nullable io $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? aym.a(ac.c()) : aym.a(ayf.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public ehd g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<eli> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public ell.a a(List<ell.a> $$0, @Nullable io $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public elh d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
