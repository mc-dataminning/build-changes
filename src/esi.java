import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class esi {
   private dpl a;
   private drc b;
   private jh c;
   private boolean d;
   @Nullable
   private eoc e;
   private erw f;
   @Nullable
   private bam g;
   private int h;
   private final List<esj> i;
   private boolean j;
   private boolean k;

   public esi() {
      this.a = dpl.a;
      this.b = drc.a;
      this.c = jh.c;
      this.f = erw.b;
      this.i = Lists.newArrayList();
   }

   public esi a() {
      esi $$0 = new esi();
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

   public esi a(dpl $$0) {
      this.a = $$0;
      return this;
   }

   public esi a(drc $$0) {
      this.b = $$0;
      return this;
   }

   public esi a(jh $$0) {
      this.c = $$0;
      return this;
   }

   public esi a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public esi a(eoc $$0) {
      this.e = $$0;
      return this;
   }

   public esi a(@Nullable bam $$0) {
      this.g = $$0;
      return this;
   }

   public esi a(erw $$0) {
      this.f = $$0;
      return this;
   }

   public esi b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public esi b() {
      this.i.clear();
      return this;
   }

   public esi a(esj $$0) {
      this.i.add($$0);
      return this;
   }

   public esi b(esj $$0) {
      this.i.remove($$0);
      return this;
   }

   public dpl c() {
      return this.a;
   }

   public drc d() {
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
   public eoc g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<esj> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == erw.b;
   }

   public esm.b a(List<esm.b> $$0, @Nullable jh $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public esi c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
