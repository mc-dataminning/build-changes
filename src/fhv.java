import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class fhv implements AutoCloseable {
   private static final double a = 3.0;
   private final fgj b = fgj.Q();
   private final gga c;
   private final fht d;
   private final Reference2ObjectMap<gfo, fbf> e = new Reference2ObjectArrayMap();
   @Nullable
   private CompletableFuture<fhu.b> f;
   private boolean g = true;

   public fhv(fht $$0) {
      this.d = $$0;
      this.c = this.b.ap();
   }

   private void a() {
      if (this.f != null) {
         if (this.f.isDone()) {
            try (fhu.b $$0 = this.f.join()) {
               $$0.a(this.e);
               fbf.b();
            }

            this.f = null;
         }
      } else if (this.g) {
         this.g = false;
         fhu.a $$1 = fhu.a.a(this.d);
         fhu $$2 = new fhu(this.c, $$1);
         this.f = CompletableFuture.supplyAsync($$2::a, ad.f());
      }
   }

   public void a(float $$0, double $$1, double $$2, double $$3, gik $$4, Matrix4f $$5, Matrix4f $$6, boolean $$7) {
      coz $$8 = this.d.d();
      ewu $$9 = new ewu(aym.d((double)$$0, $$8.ae, $$8.dz()), aym.d((double)$$0, $$8.af, $$8.dB()), aym.d((double)$$0, $$8.ag, $$8.dF()));
      cpb $$10 = this.d.e();
      if ($$4.a(
         $$9.c - 3.0,
         $$9.d - 3.0,
         $$9.e - 3.0,
         $$9.c + (double)$$10.a() + 1.0 + 3.0,
         $$9.d + (double)$$10.b() + 1.0 + 3.0,
         $$9.e + (double)$$10.c() + 1.0 + 3.0
      )) {
         this.a();
         if (!this.e.isEmpty()) {
            fag $$11 = this.b.aP();
            Vector3f $$12 = new Vector3f((float)($$9.c - $$1), (float)($$9.d - $$2), (float)($$9.e - $$3));
            if ($$7) {
               this.a(gfo.f(), $$12, $$5, $$6, $$11);
               this.a(gfo.t(), $$12, $$5, $$6, $$11);
            } else {
               this.a(gfo.c(), $$12, $$5, $$6, $$11);
               this.a(gfo.d(), $$12, $$5, $$6, $$11);
               this.a(gfo.e(), $$12, $$5, $$6, $$11);
            }
         }
      }
   }

   private void a(gfo $$0, Vector3f $$1, Matrix4f $$2, Matrix4f $$3, fag $$4) {
      fbf $$5 = (fbf)this.e.get($$0);
      if ($$5 != null) {
         $$0.a();
         gfu $$6 = RenderSystem.getShader();
         $$6.a(fbh.b.h, $$2, $$3, $$4);
         $$6.p.a($$1.x, $$1.y, $$1.z);
         $$6.g();
         $$5.a();
         $$5.c();
         fbf.b();
         $$6.f();
         $$0.b();
      }
   }

   @Override
   public void close() {
      this.e.values().forEach(fbf::close);
      this.e.clear();
      if (this.f != null) {
         this.f.thenAcceptAsync(fhu.b::close, $$0 -> RenderSystem.recordRenderCall($$0::run));
         this.f = null;
      }
   }
}
