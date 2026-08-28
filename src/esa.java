import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class esa {
   private dpd a;
   private dqu b;
   private jh c;
   private boolean d;
   @Nullable
   private enu e;
   private ero f;
   @Nullable
   private bam g;
   private int h;
   private final List<esb> i;
   private boolean j;
   private boolean k;

   public esa() {
      this.a = dpd.a;
      this.b = dqu.a;
      this.c = jh.c;
      this.f = ero.b;
      this.i = Lists.newArrayList();
   }

   public esa a() {
      esa $$0 = new esa();
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

   public esa a(dpd $$0) {
      this.a = $$0;
      return this;
   }

   public esa a(dqu $$0) {
      this.b = $$0;
      return this;
   }

   public esa a(jh $$0) {
      this.c = $$0;
      return this;
   }

   public esa a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public esa a(enu $$0) {
      this.e = $$0;
      return this;
   }

   public esa a(@Nullable bam $$0) {
      this.g = $$0;
      return this;
   }

   public esa a(ero $$0) {
      this.f = $$0;
      return this;
   }

   public esa b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public esa b() {
      this.i.clear();
      return this;
   }

   public esa a(esb $$0) {
      this.i.add($$0);
      return this;
   }

   public esa b(esb $$0) {
      this.i.remove($$0);
      return this;
   }

   public dpd c() {
      return this.a;
   }

   public dqu d() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }

   public bam b(@Nullable jh $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? bam.a(ae.c()) : bam.a(bae.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public enu g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<esb> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == ero.b;
   }

   public ese.b a(List<ese.b> $$0, @Nullable jh $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public esa c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
