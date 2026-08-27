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

public abstract class frx implements yh {
   private static final vu i = vu.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final ezi a;
   protected final us b;
   @Nullable
   protected final fso c;
   @Nullable
   protected String d;
   protected final gog e;
   @Nullable
   protected final fhh f;
   protected boolean g;
   private final List<frx.a> k = new ArrayList<>();
   protected final Map<ajh, byte[]> h;

   protected frx(ezi $$0, us $$1, fse $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
   }

   @Override
   public void a(yk $$0) {
      this.a(new yv($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(yl $$0) {
      ye.a($$0, this, this.a);
      this.b(new yw($$0.b()));
   }

   @Override
   public void a(yi $$0) {
      zc $$1 = $$0.b();
      if (!($$1 instanceof zd)) {
         ye.a($$0, this, this.a);
         if ($$1 instanceof za $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(zc var1);

   @Override
   public void a(yn $$0) {
      ye.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new yx($$1, yx.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fso.a $$5 = this.c != null ? this.c.b() : fso.a.c;
         if ($$5 != fso.a.c && (!$$4 || $$5 != fso.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(ym $$0) {
      ye.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static vu a(vu $$0, @Nullable vu $$1) {
      return (vu)($$1 == null ? $$0 : vu.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(aah $$0) {
      ye.a($$0, this, this.a);
      this.b.a(new aak($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(yo $$0) {
      ye.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(yp $$0) {
      ye.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.g = true;
         this.b.a(vu.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         ftr $$1 = new ftr($$0.b(), $$0.e());
         fga.a(Objects.requireNonNullElseGet(this.f, fhm::new), this.a, $$1, this.c, false, new fss(this.h));
      }
   }

   @Override
   public void a(yj $$0) {
      this.b.a($$0.b());
   }

   protected void f() {
      Iterator<frx.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         frx.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ac.b()) {
            $$0.remove();
         }
      }
   }

   public void b(yb<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vu $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      j.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fhh b(vu $$0) {
      fhh $$1 = Objects.requireNonNullElseGet(this.f, () -> new fkf(new fhm()));
      return (fhh)(this.c != null && this.c.e() ? new gpa($$1, i, $$0) : new fgi($$1, i, $$0));
   }

   @Nullable
   public String g() {
      return this.d;
   }

   private void a(yb<? extends vg> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new frx.a($$0, $$1, ac.b() + $$2.toMillis()));
      }
   }

   private fhh a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable vu $$4) {
      fhh $$5 = this.a.y;
      return $$5 instanceof frx.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new frx.b(this.a, $$5, List.of(new frx.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(yb<? extends vg> a, BooleanSupplier b, long c) {
   }

   class b extends ffz {
      private final List<frx.b.a> l;
      @Nullable
      private final fhh m;

      b(ezi $$0, @Nullable fhh $$1, List<frx.b.a> $$2, boolean $$3, @Nullable vu $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               glr $$6 = $$0.ae();
               if ($$5) {
                  if (frx.this.c != null) {
                     frx.this.c.a(fso.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     frx.this.b.a(vu.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (frx.this.c != null) {
                     frx.this.c.a(fso.a.b);
                  }
               }

               for (frx.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (frx.this.c != null) {
                  fsp.b(frx.this.c);
               }
            },
            $$3 ? vu.c("multiplayer.requiredTexturePrompt.line1") : vu.c("multiplayer.texturePrompt.line1"),
            frx.a($$3 ? vu.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : vu.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? vt.i : vt.f,
            $$3 ? vt.p : vt.g
         );
         this.l = $$2;
         this.m = $$1;
      }

      public frx.b a(ezi $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable vu $$5) {
         List<frx.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.l.size() + 1).addAll(this.l).add(new frx.b.a($$1, $$2, $$3)).build();
         return frx.this.new b($$0, this.m, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
