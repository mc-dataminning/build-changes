import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eug {
   private dqv a;
   private dsm b;
   private iu c;
   private boolean d;
   @Nullable
   private eqa e;
   private etu f;
   @Nullable
   private azt g;
   private int h;
   private final List<euh> i;
   private boolean j;
   private boolean k;

   public eug() {
      this.a = dqv.a;
      this.b = dsm.a;
      this.c = iu.c;
      this.f = etu.b;
      this.i = Lists.newArrayList();
   }

   public eug a() {
      eug $$0 = new eug();
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

   public eug a(dqv $$0) {
      this.a = $$0;
      return this;
   }

   public eug a(dsm $$0) {
      this.b = $$0;
      return this;
   }

   public eug a(iu $$0) {
      this.c = $$0;
      return this;
   }

   public eug a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public eug a(eqa $$0) {
      this.e = $$0;
      return this;
   }

   public eug a(@Nullable azt $$0) {
      this.g = $$0;
      return this;
   }

   public eug a(etu $$0) {
      this.f = $$0;
      return this;
   }

   public eug b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public eug b() {
      this.i.clear();
      return this;
   }

   public eug a(euh $$0) {
      this.i.add($$0);
      return this;
   }

   public eug b(euh $$0) {
      this.i.remove($$0);
      return this;
   }

   public dqv c() {
      return this.a;
   }

   public dsm d() {
      return this.b;
   }

   public iu e() {
      return this.c;
   }

   public azt b(@Nullable iu $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azt.a(af.c()) : azt.a(azk.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eqa g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<euh> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == etu.b;
   }

   public euk.b a(List<euk.b> $$0, @Nullable iu $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public eug c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
