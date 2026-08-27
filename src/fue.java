import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fue implements yt {
   private static final wg i = wg.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final fbp a;
   protected final ve b;
   @Nullable
   protected final fuv c;
   @Nullable
   protected String d;
   protected final gqn e;
   @Nullable
   protected final fjo f;
   protected boolean g;
   private final List<fue.a> k = new ArrayList<>();
   protected final Map<ajt, byte[]> h;

   protected fue(fbp $$0, ve $$1, ful $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
   }

   @Override
   public void a(yw $$0) {
      this.a(new zh($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(yx $$0) {
      yq.a($$0, this, this.a);
      this.b(new zi($$0.b()));
   }

   @Override
   public void a(yu $$0) {
      zo $$1 = $$0.b();
      if (!($$1 instanceof zp)) {
         yq.a($$0, this, this.a);
         if ($$1 instanceof zm $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(zo var1);

   @Override
   public void a(yz $$0) {
      yq.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new zj($$1, zj.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fuv.a $$5 = this.c != null ? this.c.b() : fuv.a.c;
         if ($$5 != fuv.a.c && (!$$4 || $$5 != fuv.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(yy $$0) {
      yq.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static wg a(wg $$0, @Nullable wg $$1) {
      return (wg)($$1 == null ? $$0 : wg.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(aat $$0) {
      yq.a($$0, this, this.a);
      this.b.a(new aaw($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(za $$0) {
      yq.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zb $$0) {
      yq.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.g = true;
         this.b.a(wg.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         fvy $$1 = new fvy($$0.b(), $$0.e());
         fih.a(Objects.requireNonNullElseGet(this.f, fjt::new), this.a, $$1, this.c, false, new fuz(this.h));
      }
   }

   @Override
   public void a(yv $$0) {
      this.b.a($$0.b());
   }

   protected void f() {
      Iterator<fue.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         fue.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(yn<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(wg $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      j.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fjo b(wg $$0) {
      fjo $$1 = Objects.requireNonNullElseGet(this.f, () -> new fml(new fjt()));
      return (fjo)(this.c != null && this.c.e() ? new grh($$1, i, $$0) : new fip($$1, i, $$0));
   }

   @Nullable
   public String g() {
      return this.d;
   }

   private void a(yn<? extends vs> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new fue.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   private fjo a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable wg $$4) {
      fjo $$5 = this.a.y;
      return $$5 instanceof fue.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fue.b(this.a, $$5, List.of(new fue.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(yn<? extends vs> a, BooleanSupplier b, long c) {
   }

   class b extends fig {
      private final List<fue.b.a> o;
      @Nullable
      private final fjo p;

      b(fbp $$0, @Nullable fjo $$1, List<fue.b.a> $$2, boolean $$3, @Nullable wg $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               gny $$6 = $$0.ae();
               if ($$5) {
                  if (fue.this.c != null) {
                     fue.this.c.a(fuv.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fue.this.b.a(wg.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fue.this.c != null) {
                     fue.this.c.a(fuv.a.b);
                  }
               }

               for (fue.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fue.this.c != null) {
                  fuw.b(fue.this.c);
               }
            },
            $$3 ? wg.c("multiplayer.requiredTexturePrompt.line1") : wg.c("multiplayer.texturePrompt.line1"),
            fue.a($$3 ? wg.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : wg.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wf.i : wf.f,
            $$3 ? wf.p : wf.g
         );
         this.o = $$2;
         this.p = $$1;
      }

      public fue.b a(fbp $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable wg $$5) {
         List<fue.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.o.size() + 1).addAll(this.o).add(new fue.b.a($$1, $$2, $$3)).build();
         return fue.this.new b($$0, this.p, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
