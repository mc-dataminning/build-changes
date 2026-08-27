import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ekc {
   private dhs a;
   private dji b;
   private im c;
   private boolean d;
   @Nullable
   private efy e;
   private boolean f;
   @Nullable
   private ayd g;
   private int h;
   private final List<ekd> i;
   private boolean j;
   private boolean k;

   public ekc() {
      this.a = dhs.a;
      this.b = dji.a;
      this.c = im.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public ekc a() {
      ekc $$0 = new ekc();
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

   public ekc a(dhs $$0) {
      this.a = $$0;
      return this;
   }

   public ekc a(dji $$0) {
      this.b = $$0;
      return this;
   }

   public ekc a(im $$0) {
      this.c = $$0;
      return this;
   }

   public ekc a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ekc a(efy $$0) {
      this.e = $$0;
      return this;
   }

   public ekc a(@Nullable ayd $$0) {
      this.g = $$0;
      return this;
   }

   public ekc b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public ekc c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ekc b() {
      this.i.clear();
      return this;
   }

   public ekc a(ekd $$0) {
      this.i.add($$0);
      return this;
   }

   public ekc b(ekd $$0) {
      this.i.remove($$0);
      return this;
   }

   public dhs c() {
      return this.a;
   }

   public dji d() {
      return this.b;
   }

   public im e() {
      return this.c;
   }

   public ayd b(@Nullable im $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? ayd.a(ac.b()) : ayd.a(axw.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public efy g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<ekd> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public ekg.a a(List<ekg.a> $$0, @Nullable im $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ekc d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
